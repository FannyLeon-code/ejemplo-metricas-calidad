package com.ejemplo;

public class BadCode {
    public void calcularDescuento(int edad, int antiguedad, boolean esMiembro, double salario, String tipoCliente) {
        double descuento = 0;
        if (edad > 60) {
            if (antiguedad > 10) {
                if (esMiembro) {
                    if (salario > 5000000) {
                        descuento = 35;
                    } else if (salario > 3000000) {
                        descuento = 30;
                    } else {
                        descuento = 25;
                    }
                } else {
                    descuento = 15;
                }
            } else {
                descuento = 10;
            }
        } else if (edad > 30) {
            if (tipoCliente.equals("VIP")) {
                descuento = 20;
            } else if (tipoCliente.equals("Normal")) {
                descuento = 12;
            }
        } else {
            descuento = 5;
        }
        System.out.println("Descuento aplicado: " + descuento + "%");
    }

    // Método dios (hace de todo)
    public void procesarTodo(int x, int y, String z) {
        if (x > 0) {
            if (y > 0) {
                if (z.length() > 5) {
                    // ... más ifs anidados
                }
            }
        }
    }
}
