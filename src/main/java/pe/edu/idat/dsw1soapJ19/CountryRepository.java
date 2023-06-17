package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Diasemana;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Diasemana> diasemana = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Diasemana lunes = new Diasemana();
		lunes.setName("Lunes");
	
		lunes.setTraducido("Monday");
		diasemana.put(lunes.getName(), lunes);

		Diasemana martes = new Diasemana();
		martes.setName("Martes");

		martes.setTraducido("Tuesday");
		diasemana.put(martes.getName(), martes);

		
		Diasemana miercoles = new Diasemana();
		miercoles.setName("Miercoles");

		miercoles.setTraducido("Wednesday");
		diasemana.put(miercoles.getName(), miercoles);

		Diasemana jueves = new Diasemana();
		jueves.setName("Jueves");

		jueves.setTraducido("Thursday");
		diasemana.put(jueves.getName(), jueves);

		Diasemana viernes = new Diasemana();
		viernes.setName("Viernes");

		viernes.setTraducido("Friday");
		diasemana.put(viernes.getName(), viernes);

		Diasemana sabado = new Diasemana();
		sabado.setName("Sabado");
	
		sabado.setTraducido("Saturday");
		diasemana.put(sabado.getName(), sabado);

		Diasemana domingo = new Diasemana();
		domingo.setName("Domingo");
	
		domingo.setTraducido("Sunday");
		diasemana.put(domingo.getName(),domingo);
	}

	public Diasemana findDiasemana(String name) {
		Assert.notNull(name, "Dia Incorrecto");
		return diasemana.get(name);
	}
    
}
