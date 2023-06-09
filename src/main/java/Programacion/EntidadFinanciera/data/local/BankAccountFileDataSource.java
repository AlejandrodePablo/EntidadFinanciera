package Programacion.EntidadFinanciera.data.local;
/*
import Programacion.EntidadFinanciera.domain.models.BankAccount;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BankAccountFileDataSource {

	private String nameFile = "BankAccount.txt";

    private Gson gson = new Gson();

    private static BankAccountFileDataSource instance = null;


    private final Type typeList = new TypeToken<ArrayList<BankAccount>>() {
    }.getType();

    public void save(BankAccount model) {
        List<BankAccount> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<BankAccount> models) {
        saveToFile(models);
    }

    private void saveToFile(List<BankAccount> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public BankAccount findById(Integer id) {
        List<BankAccount> models = findAll();
        for (BankAccount model : models) {
            if (Objects.equals(model.getId(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<BankAccount> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(String modelId) {
        List<BankAccount> newList = new ArrayList<>();
        List<BankAccount> models = findAll();
        for (BankAccount model : models) {
            if (model.getId() != modelId) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
    public static BankAccountFileDataSource getInstance(){
        if (instance==null){
            instance = new BankAccountFileDataSource();
        }
        return instance;
    }
}*/