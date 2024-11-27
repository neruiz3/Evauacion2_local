package com.example.solicitud_service.entity;

import com.example.solicitud_service.Estado;
import com.example.solicitud_service.TipoPrestamo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "creditos")
@Data //genera automaticamente los getters y setters
@NoArgsConstructor //genera un constructor sin argumentos para la clase
@AllArgsConstructor //constructor con todos los argumentos de la clase, por si se los pasas
public class SolicitudEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id; //se va a utilizar para identificar a las evaluaciones y a los seguimientos

    private String rut; //para saber el cliente que ha solicitado ese credito, no se si hace fala realmente

    @Column(name = "plazo", nullable = false)
    private int plazo;

    @Column(name = "tasaInteres", nullable = false)
    private double tasaInteres;

    @Column(name = "monto", nullable = false)
    private double monto;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoPrestamo", nullable = false)
    private TipoPrestamo tipoPrestamo;

    private double valorPropiedad;

    private double cuotaMensual; // no estoy segura de que haya que incluir aqui la cuota mensual
}
