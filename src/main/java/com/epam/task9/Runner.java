package com.epam.task9;

import java.util.*;

class Runner {

    public static void main(String[] args) {
        ArrayList<HomeAppliances> homeAppliancesList = new ArrayList<HomeAppliances>() {
            {
                add(new HomeAppliances(1,"Холодильник", "Крупногабаритная техника", 200, 1));
                add(new HomeAppliances(2,"Стиральная машина", "Крупногабаритная техника", 2000, 1));
                add(new HomeAppliances(3,"Посудомоечная машина", "Крупногабаритная техника", 1500, 1));
                add(new HomeAppliances(4,"Сушильная машина", "Крупногабаритная техника", 3000, 1));

                add(new HomeAppliances(5,"Персональный компьютер", "Электроника", 600, 2));
                add(new HomeAppliances(6,"Телевизор", "Электроника", 200, 2));
                add(new HomeAppliances(7,"Утюг", "Электроника", 2200, 2));
                add(new HomeAppliances(8,"Фен для волос", "Электроника", 1700, 2));
                add(new HomeAppliances(9,"Настольная лампа", "Электроника", 100, 2));
                add(new HomeAppliances(10,"Мобильный телефон", "Электроника", 5, 2));
                add(new HomeAppliances(11,"Игровая приставка", "Электроника", 100, 2));
                add(new HomeAppliances(12,"Музыкальный центр", "Электроника", 400, 2));
                add(new HomeAppliances(13,"Обогреватель масляный", "Электроника", 2100, 2));
                add(new HomeAppliances(14,"Принтер", "Электроника", 34, 2));

                add(new HomeAppliances(15,"Пылесос", "Уборка", 530, 3));
                add(new HomeAppliances(16,"Пароочиститель", "Уборка", 450, 3));

                add(new HomeAppliances(17,"Мультиварка", "Приготовление пищи", 1100, 4));
                add(new HomeAppliances(18,"Сэндвичница", "Приготовление пищи", 600, 4));
                add(new HomeAppliances(19,"Тостер", "Приготовление пищи", 800, 4));
                add(new HomeAppliances(20,"Микроволновая печь", "Приготовление пищи", 2100, 4));
                add(new HomeAppliances(21,"Электрогриль", "Приготовление пищи", 1400, 4));

                add(new HomeAppliances(22,"Чайник", "Приготовление чая и кофе", 1300, 5));
                add(new HomeAppliances(23,"Кофемашина", "Приготовление чая и кофе", 1600, 5));
                add(new HomeAppliances(24,"Кофемолка", "Приготовление чая и кофе", 170, 5));

                add(new HomeAppliances(25,"Куфонный комбайн", "Подготовка и обработка продуктов", 900, 6));
                add(new HomeAppliances(26,"Мясорубка", "Подготовка и обработка продуктов", 1650, 6));
                add(new HomeAppliances(27,"Соковырималка", "Подготовка и обработка продуктов", 870, 6));
                add(new HomeAppliances(28,"Блендер", "Подготовка и обработка продуктов", 500, 6));
                add(new HomeAppliances(29,"Миксер", "Подготовка и обработка продуктов", 150, 6));
            }
        };

        AppliancesSorter appliancesSorter = new AppliancesSorter();
        appliancesSorter.displayAppliancesType(homeAppliancesList);
        appliancesSorter.sumPowersTurnedOnAppliances(homeAppliancesList);
        appliancesSorter.sortAppliancesByPower(homeAppliancesList);
        appliancesSorter.findNecessaryAppliance(homeAppliancesList);
    }
}

