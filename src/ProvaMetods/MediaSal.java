/* Este programa tem como finalidade informar a m�dia salarial dos funcionarios de uma empresa
 * e informando se esta acima ou abaixo do previsto pela empresa
 */
package ProvaMetods;

import javax.swing.JOptionPane;

public class MediaSal {
	
	static float FunSal(int A) {//M�todo que recebe os sal�rios dos funcionarios informados
		float Sal[] = new float[A], SalT =0;
		
		for(int P =0; P<A; P++) {
		Sal[P] = Float.parseFloat(JOptionPane.showInputDialog(null, "Inisira o  salario do " + (P+1) + "� funcion�rio", "MultiGeyser", 3));
		
		SalT = SalT + Sal[P];//C�culo da soma de todos salarios, feito a cada loop
		}
		
		return SalT;
	}
	static String MediaSalr(float Prev, float SalT, int Funcs) {//M�todo que c�cula a m�dia slarial e verifica se esta acima ou abaixo da m�dia prevista
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
		
		Final = "M�dia sal�rial da empresa � de:\nR$:" + Md + "\nR$:" + SubMd + PrevD + " do previsto";
		return Final;
	}

	public static void main(String[] args) {
		float Prev =0, SalF =0;
		int Funcs =0;
		String SaltM ="";
		
		Funcs = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos funcionarios h� na empresa?:", "MultiGeyser", 3));
		
		Prev = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual � a m�dia prevista de sal�rio?:", "MultiGeyser", 3));
		
		
		SalF= FunSal(Funcs);
		
		SaltM = MediaSalr(Prev, SalF, Funcs);
		
		JOptionPane.showMessageDialog(null, SaltM, "MultGeyser", 1);//Informe da mensagem a respeito da m�dia

	}

}
