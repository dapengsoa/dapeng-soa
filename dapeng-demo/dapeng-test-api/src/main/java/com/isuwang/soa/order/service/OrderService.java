
      package com.isuwang.soa.order.service;

      import com.github.dapeng.core.Processor;
      import com.github.dapeng.core.Service;
      import com.github.dapeng.core.SoaGlobalTransactional;

      /**
       * Autogenerated by Dapeng-Code-Generator (2.0.5)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

      * 
      **/
      @Service(name="com.isuwang.soa.order.service.OrderService",version = "1.0.0")
      @Processor(className = "com.isuwang.soa.order.OrderServiceCodec$Processor")
      public interface OrderService {
      
          /**
          * 
          **/
          
          
            void createOrder( com.isuwang.soa.order.domain.Order order) throws com.github.dapeng.core.SoaException;
          
        
          /**
          * 
          **/
          
          
            com.isuwang.soa.order.domain.Order getOrderById( Integer orderId) throws com.github.dapeng.core.SoaException;
          
        
    }
    