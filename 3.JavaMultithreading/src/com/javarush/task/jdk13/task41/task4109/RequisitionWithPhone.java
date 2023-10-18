package com.javarush.task.jdk13.task41.task4109;

public abstract class RequisitionWithPhone extends RequisitionBase {
    public String phone;

    public RequisitionWithPhone(){

    }

    public RequisitionWithPhone(RequisitionWithPhone requisition){
        super(requisition);
        phone = requisition.phone;
    }


}
