public class ShowroomManagementSystem{
    
    public static void main(String[] args) {
        
        // Person details
        Person person = new Person("Ehtsham", 25, "777-111-666");
        person.displayInfo();
        person.updateCellNumber("222-333-444");
        person.displayInfo();
        System.out.println();
        System.out.println(".........WELCOME TO EHTSHAM'S SHOWROOM.........");
        System.out.println();
        System.out.println("Available Cars in our Showroom:");

        // Showroom details
        Showroom showroom = new Showroom("Super Cars stock", 5);

        Car car1 = new Car("Toyota", "Corolla", 30000);
        Car car2 = new Car("Honda", "Civic", 35000);
        Car car3 = new Car("Ford", "Mustang", 45000);
        Car car4 = new Car("Chevrolet", "Camaro", 42000);
        Car car5 = new Car("BMW", "M3", 70000);
        Car car6 = new Car("Audi", "A4", 40999.99);

        showroom.addCar(car1);
        showroom.addCar(car2);
        showroom.addCar(car3);
        showroom.addCar(car4);
        showroom.addCar(car5);
        showroom.addCar(car6); // Attempt to add a car when the showroom is full

        showroom.showCars(); 
        System.out.println();
        System.out.println("We are giving discout to you:");
        System.out.println();

         // Applying discount to cars 
         car1.displayCarInfo(); 
         car1.applyDiscount(5000); 
         car1.displayCarInfo(); 
         
         car2.displayCarInfo(); 
         car2.applyDiscount(5000); 
         car2.displayCarInfo();
         System.out.println();
         System.out.println("Purchasers INFO:");
         System.out.println();
 
         // Customer details
         Buyer customer = new Buyer("FRAAZ", 28, "999-000-888", "C001"); 
         customer.viewCustomerInfo(); 
         customer.purchaseCar(car3);
         System.out.println();
         System.out.println("Available Employee:");
         System.out.println();
 
         // show employee details
         Employee employee = new Employee("AFTAB", 30, "123-456-7890", "E12345", "Software Engineer");
         employee.displayEmployeeInfo(); 
         employee.performDuty();
         System.out.println();
         System.out.println("ORDERS DETAILS:");
         System.out.println();

         // Create Order object 
         Order order = new Order("O123", customer, car3); 
         // Place order 
         order.placeOrder(); 
         // View order details 
         order.viewOrderDetails();
         System.out.println();
         System.out.println("PLZZ CHOICE YOUR PAYMENT OPTIONS:");
         System.out.println();

         PaymentOption paymentOption = PaymentOption.choosePaymentMethod(); 
         paymentOption.displayPaymentDetails(); 
         paymentOption.processPayment();
         System.out.println();
         System.out.println("SUPLY CARS BY SUPLIERS DETAILS:");
         System.out.println();

        //  suplier suply cars details
        Supplier supplier = new Supplier("Super Cars Supplier", 3);
        supplier.supplyCar(car1); 
        supplier.supplyCar(car2); 
        supplier.supplyCar(car3);
        supplier.showSuppliedCars();
        System.out.println();
        System.out.println("INVENTORY DETAILS:");
        System.out.println();

        Inventory inventory = new Inventory(6);
        inventory.addCar(car1); 
        inventory.addCar(car2); 
        inventory.addCar(car3);
        // Display inventory 
        inventory.displayInventory();
        System.out.println();
        System.out.println("WARANTY DETAILS:");
        System.out.println();

        // waranty details
        Car car = new Car("Ford", "Mustang", 45000);
        Warranty warranty = new Warranty("W123", car, "2025-12-31");
        warranty.displayWarrantyDetails();
        // update date 
        warranty.extendWarranty("2026-12-31");
        warranty.displayWarrantyDetails();
        System.out.println();
        System.out.println("AVAILABLE INSURANCE :");
        System.out.println();
        // for insurance
        System.out.println("insurance re-new datails ");
        Insurance insurance = new Insurance("INS12345", car, "Full Coverage", "2025-12-31");
        insurance.renewInsurance("2026-12-31");
        insurance.displayInsuranceDetails();
        System.out.println();
        System.out.println("FEEDBACKS FROM CUSTOMERS");
        System.out.println();

                // For feedback
                
                Feedback feedback = new Feedback("F123", customer, "Great service!", 5);
                feedback.displayFeedback();
                feedback.updateComments("Thank you for Excellent service!");
                feedback.displayFeedback();
                System.out.println();
                System.out.println("THANK YOU FOR PURCHASING FROM HERE!");
            
    }
}