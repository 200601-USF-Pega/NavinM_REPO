package com.revature.tourofheroes.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.tourofheroes.models.Hero;

public class HeroRepoFile implements IHeroRepo {
    private String filepath= "src/resources/Hero.txt";

    @Override
    public Hero addHero(Hero hero) {
        // TODO Auto-generated method stub
        List<Hero> currentHeroes= this.getAllHeros();
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream(filepath));
            currentHeroes.add(hero);
            objectOutputStream.writeObject(currentHeroes);
            objectOutputStream.close();
            return hero;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return null;
}

    //finish this method
    @Override
    public List<Hero> getAllHeros() {
        // TODO Auto-generated method stub
        try {
            ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream(filepath));
            List<Hero> retreivedHeroes= (ArrayList<Hero>) inputStream.readObject();
            inputStream.close();
            return retreivedHeroes;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            //Just in class Hero class is not found
            e.printStackTrace();
        }
        return new ArrayList<Hero>();
    }

}