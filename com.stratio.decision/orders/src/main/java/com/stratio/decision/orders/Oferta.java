package com.stratio.decision.orders;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Oferta implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer id;
   private java.lang.String descripcion;
   private java.lang.Integer porcentaje;

   public Oferta()
   {
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId(java.lang.Integer id)
   {
      this.id = id;
   }

   public java.lang.String getDescripcion()
   {
      return this.descripcion;
   }

   public void setDescripcion(java.lang.String descripcion)
   {
      this.descripcion = descripcion;
   }

   public java.lang.Integer getPorcentaje()
   {
      return this.porcentaje;
   }

   public void setPorcentaje(java.lang.Integer porcentaje)
   {
      this.porcentaje = porcentaje;
   }

   public Oferta(java.lang.Integer id, java.lang.String descripcion,
         java.lang.Integer porcentaje)
   {
      this.id = id;
      this.descripcion = descripcion;
      this.porcentaje = porcentaje;
   }

}