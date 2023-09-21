package br.com.buscarcep.dominio;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

    public static String converterEmJson(BufferedReader bufferedReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = bufferedReader.readLine()) != null){
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
