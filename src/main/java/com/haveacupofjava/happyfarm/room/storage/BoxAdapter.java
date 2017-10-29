package com.haveacupofjava.happyfarm.room.storage;

import com.haveacupofjava.happyfarm.produce.AbstractProduce;
import com.haveacupofjava.happyfarm.product.AbstractProduct;

import java.util.List;

public class BoxAdapter extends AbstractBox {

    private SpecialBox specialBox;

    public BoxAdapter(AbstractProduce produce){
        String name = produce.getName();
        if(name.endsWith("meat")){
            specialBox = new MeatBox();
        }else if(name.endsWith("milk")){
            specialBox = new MilkBox();
        }else if(name.endsWith("fruit")){
            specialBox = new FruitBox();
        }
    }

    /**
     *
     * @param products products list
     * @param produce the produce will be stored
     */
    @Override
    public void storage(List<AbstractProduct> products, AbstractProduce produce) {
        String name = produce.getName();
        if(name.endsWith("meat")){
            specialBox.storage(products, produce);
        }else if(name.endsWith("milk")){
            specialBox.storage(products, produce);
        }else if(name.endsWith("fruit")){
            specialBox.storage(products, produce);
        }
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public AbstractProduct clone() {
        return null;
    }
}
