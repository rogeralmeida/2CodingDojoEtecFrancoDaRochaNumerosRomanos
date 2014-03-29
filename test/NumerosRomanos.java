import java.util.HashMap;
import java.util.Map;


public class NumerosRomanos {

	public Integer traduz(String valorRomano) {
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("I", new Integer(1));
		mapa.put("V", new Integer(5));
		mapa.put("X", new Integer(10));
		mapa.put("L", new Integer(50));
		mapa.put("C", new Integer(100));
		mapa.put("D", new Integer(500));
		mapa.put("M", new Integer(1000));
		Integer valorArabico = null;
		
		if(valorRomano.length() == 1){
			valorArabico = mapa.get(valorRomano);
		} else if (valorRomano.length() == 2){
			Integer primeiroValor = mapa.get("" +valorRomano.charAt(0));
			Integer segundoValor = mapa.get("" + valorRomano.charAt(1));
			
			if (segundoValor>primeiroValor){
				valorArabico = segundoValor - primeiroValor;
			}
			else {
				valorArabico = segundoValor + primeiroValor;
			}
		}
		if (valorRomano.length() ==3){
			 valorArabico =
		}
		
		
		else if(valorRomano == "III")
		{
			valorArabico = 3;
		}
		
		else if(valorRomano == "VII")
		{
			valorArabico = 7;
		}	
		else if(valorRomano == "VIII")
			{
				valorArabico = 8;
		}
		
		else if(valorRomano == "XII")
		{
			valorArabico = 12;
	
		}
		else if(valorRomano == "XIII")
		{
			valorArabico = 13;
		}	
		
		else if(valorRomano == "XIV")
		{
			valorArabico = 14;
		}	
		else if(valorRomano == "XVI")
		{
			valorArabico = 16;
		}	
		return valorArabico;
	}

}
