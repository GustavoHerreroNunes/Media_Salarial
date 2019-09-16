/* Este programa tem como finalidade informar a média salarial dos funcionarios de uma empresa
 * e informando se esta acima ou abaixo do previsto pela empresa
 */
package ProvaMetods;

import javax.swing.JOptionPane;

public class MediaSal {
	
	static float FunSal(int A) {//Método que recebe os salários dos funcionarios informados
		float Sal[] = new float[A], SalT =0;
		
		for(int P =0; P<A; P++) {
		Sal[P] = Float.parseFloat(JOptionPane.showInputDialog(null, "Inisira o  salario do " + (P+1) + "º funcionário", "MultiGeyser", 3));
		
		SalT = SalT + Sal[P];//Cáculo da soma de todos salarios, feito a cada loop
		}
		
		return SalT;
	}
	static String MediaSalr(float Prev, float SalT, int Funcs) {//Método que cácula a média slarial e verifica se esta acima ou abaixo da média prevista
		String Final="", PrevD ="";
		float Md =0, SubMd =0;
		
		Md = SalT/Funcs;
		
		if(Md>=Prev) {
			SubMd = Md - Prev;
			PrevD = " Acima";
		}else if(Prev>Md) {
			SubMd = Prev - Md;
			PrevD = " Abaixo";
		}
		
		Final = "Média salárial da empresa é de:\nR$:" + Md + "\nR$:" + SubMd + PrevD + " do previsto";
		return Final;
	}

	public static void main(String[] args) {
		float Prev =0, SalF =0;
		int Funcs =0;
		String SaltM ="";
		
		Funcs = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos funcionarios há na empresa?:", "MultiGeyser", 3));
		
		Prev = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual é a média prevista de salário?:", "MultiGeyser", 3));
		
		
		SalF= FunSal(Funcs);
		
		SaltM = MediaSalr(Prev, SalF, Funcs);
		
		JOptionPane.showMessageDialog(null, SaltM, "MultGeyser", 1);//Informe da mensagem a respeito da média

	}

}
