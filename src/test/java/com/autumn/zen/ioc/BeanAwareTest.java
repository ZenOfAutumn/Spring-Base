package com.autumn.zen.ioc;

import java.util.Map;

import org.junit.Test;

import com.autumn.zen.applocationContext.ApplicationContextCollection;
import com.autumn.zen.ioc.bean.BasketBallPlayer;
import com.autumn.zen.ioc.bean.Person;
import com.autumn.zen.ioc.bean.Team;

public class BeanAwareTest {

	@Test
	public void testBeanAware() {
		CompletableBean cb = (CompletableBean) ApplicationContextCollection.CLASS_PATH_CTX.getBean("completable");
	}

	@Test
	public void postTest() {
		Map<String, Person> mb = ApplicationContextCollection.CLASS_PATH_CTX.getBeansOfType(Person.class);
		for (String id : mb.keySet()) {
			Person ps = mb.get(id);
			System.out.println(id + ps);
		}
		
		Map<String, BasketBallPlayer> bp = ApplicationContextCollection.CLASS_PATH_CTX.getBeansOfType(BasketBallPlayer.class);
		for (String id : bp.keySet()) {
			BasketBallPlayer ps = bp.get(id);
			System.out.println(id + ps);
		}
		
	}
	
	public static void main(String[] args) {
		Map<String, Person> mb = ApplicationContextCollection.CLASS_PATH_CTX.getBeansOfType(Person.class);
		for (String id : mb.keySet()) {
			Person ps = mb.get(id);
			System.out.println(id + ps);
		}
		
		Map<String, BasketBallPlayer> bp = ApplicationContextCollection.CLASS_PATH_CTX.getBeansOfType(BasketBallPlayer.class);
		for (String id : bp.keySet()) {
			BasketBallPlayer ps = bp.get(id);
			System.out.println(id + ps);
		}
		
		Map<String, Team> teams = ApplicationContextCollection.CLASS_PATH_CTX.getBeansOfType(Team.class);
		for (String id : teams.keySet()) {
			Team ps = teams.get(id);
			System.out.println(id+"==============================");
			System.out.println(ps.getPlayers());
			System.out.println(ps.getYears());
			System.out.println(ps.getMvpEveryYear());
			System.out.println(ps.getPlayersPhone());
		}
		
		
		
	}

}
