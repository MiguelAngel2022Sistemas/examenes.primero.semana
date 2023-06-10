package com.exame.idat.semanasoapj19;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Weeks;
import io.spring.guides.gs_producing_web_service.Week;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
@Component
public class WeeksRepository {
    

	private static final Map<String, Week> semana = new HashMap<>();

	@PostConstruct
	public void initData() {
		Week lunes = new Week();
		lunes.setName("LUNES");
		lunes.setWeeks(Weeks.MONDAY);
	

		semana.put(lunes.getName(), lunes);

		Week martes = new Week();
		martes.setName("MARTES");

		martes.setWeeks(Weeks.TUESDAY);
	

		semana.put(martes.getName(), martes);

		Week miercoles = new Week();
		miercoles.setName("MIERCOLES");

		miercoles.setWeeks(Weeks.WEDNESDAY);
		
		semana.put(miercoles.getName(), miercoles);


		Week jueves = new Week();
		jueves.setName("JUEVES");
		jueves.setWeeks(Weeks.TURSDAY);
	

		semana.put(jueves.getName(), jueves);





        Week viernes = new Week();
		viernes.setName("VIERNES");
		viernes.setWeeks(Weeks.FRIDAY);
	

		semana.put(viernes.getName(), viernes);





        Week sabado = new Week();
		sabado.setName("SABADO");
		sabado.setWeeks(Weeks.SATURDAY);
	

		semana.put(sabado.getName(), sabado);


        Week domingo = new Week();
		domingo.setName("DOMINGO");
		domingo.setWeeks(Weeks.SUNDAY);
	

		semana.put(domingo.getName(), domingo);

	}

	public Week findWeek(String name) {
		Assert.notNull(name, "The Week's name must not be null");
		return semana.get(name);
	} 


}

