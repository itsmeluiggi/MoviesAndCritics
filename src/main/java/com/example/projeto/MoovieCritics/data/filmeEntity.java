/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projeto.MoovieCritics.data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data 
@Entity 
@Table(name="movie")
public class filmeEntity { 
@Id 
@GeneratedValue(strategy = GenerationType.AUTO) 
private Integer id; 
private String title; 
private String descriptionn; 
private String gender; 
private String releasedyear; 
}
