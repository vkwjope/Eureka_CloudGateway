# Eureka_CloudGateway

Components:
1. cloud-gateway
2. servce-registry
3. order-service
4. payment-service

**cloud-gateway** : Uses Spring cloud api gateway for routing service

**servce-registry** : Uses Eureka Naming Server for service discovery

**order-service & payment-service** : Sample services with a single endpint returning a String as a response.

**Endpoints**

**payment-service**
http://localhost:8122/payments/payment

**order-service**
http://localhost:8111/orders/order

**Eureka:**
http://localhost:8761/

**Order with Cloud Gaeway:**
http://localhost:8441/orders/order

**Payemnts with Cloud gateaway:**
http://localhost:8441/payments/payment
