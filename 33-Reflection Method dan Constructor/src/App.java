import com.hero.heroagility;
import java.lang.reflect.*;

public class App {
    public static void main(String[] args) throws Exception {
        heroagility hero1 = new heroagility("rakha",100);
        System.out.println("kita akan mengubah ");
        hero1.showall();

        Method[] methodhero = hero1.getClass().getDeclaredMethods();

        for (Method method:methodhero){
            if(method.getName().equals("setherotype")){
				System.out.println("\nmenginvoke method setherotype\n");
				method.setAccessible(true);
				method.invoke(hero1,"intel");
			}
			if(method.getName().equals("setnickname")){
				System.out.println("\nmenginvoke method setnickname\n");
				method.setAccessible(true);
				method.invoke(hero1,"Brandon");
			}
		}

		hero1.showall();

		// kita ingin mengakses constructor
		Object newHero = new Object();

		Constructor<?>[] constructorHero = hero1.getClass().getConstructors();
		for(Constructor<?> constructor:constructorHero){
			if(constructor.getName().equals("com.hero.heroagility")){
				Object[] obj = {"james",20};
				newHero = constructor.newInstance(obj);
			}
		}
		
		heroagility hero2 = (heroagility) newHero;
		hero2.showall();

        }

    }

