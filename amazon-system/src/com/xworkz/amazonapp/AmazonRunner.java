package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.generatedata.AmazonDto;

public class AmazonRunner {

        public static void main(String[] args) {
            AmazonDto amazon = new AmazonDto();

            amazon.setProductName("camera");
            amazon.setPrice(18999);
            amazon.setQuantity(1);
            amazon.setSellerName("TechGadgets");
            amazon.setCategory("Electronics");
            amazon.setInStock(true);

            Amazon amazonOrder = new Amazon();
            amazonOrder.registerOrder(amazon);
        }
    }
