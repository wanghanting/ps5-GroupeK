package model;

/**
 * @Project: ps5-GroupeK
 * @Author: WANG Hanting
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public enum  Color {
    Trefle("Tr"),  Carreau("Ca"), Coeur("Co"), Pique("Pi");

    private String name;

    Color(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
}
