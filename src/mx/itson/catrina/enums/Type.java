/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.catrina.enums;
import com.google.gson.annotations.SerializedName;
/**
 *Clase tipo enumerador que se utiliza para saber que tipo de transaccion se 
 * utilizo, estando serealizadas como 1 para los depositos y 2 para los retiros.
 * @author aleja
 */
public enum Type {
    @SerializedName("1")
    DEPOSIT,
    @SerializedName("2")
    WITHDRAWALS
}
