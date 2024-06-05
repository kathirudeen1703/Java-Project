<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Motor Insurance Policy</title>
<style type="text/css">
html { 
  background: url("Motor2.jpg") no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
h1{
color:red;
}

</style>

</head>
<body >
<h1>Motor_Insurance_policy</h1>
<form action="addDetails" method="post" style="font_weight:bold;">
    <div>
    <label>Name :</label>
    <input type="text" name="name">
    </div>
    <br>
    <div>
    <label>Address :</label>
    <input type="text" name="address">
    </div>
    <br>
    <div>
    <label>Mobile_No :</label>
    <input type="text" name="mobile_no">
    </div>
    <br>
    <div>
    <label>Email_id :</label>
    <input type="text" name="email_id">
    </div>
    <br>
    <div>
    <label>Registration_Number :</label>
    <input type="text" name="Registration_Number">
    </div>
    <br>
    
    <div>
        <label>Vehicle type :</label>
       <select name="Vehicle_type">
        <option value=""></option>
        
        <option >2 Wheeler</option>
        <option >4 Wheeler</option>
        </select>
            </div>
            <br>

            <div>
                <label>Make :</label>
               <select name="Make">
                <option ></option>
                <option >BAJAJ</option>
                <option >YAMAHA</option>
                <option >TVS</option>
                <option >HONDA</option>
                <option >TATA_MOTORS</option>
                <option >MARUTI_SUZKI</option>
                <option>HYUNDAI</option>
                    </select>
                    </div>
                         <br>

                    <div>
                        <label>Modal :</label>
                       <select  name="Modal" id="ddselect" onchange="handle()">

                        <option value=""></option>
                        <option value="Bajaj Pulsar 150">Bajaj Pulsar 150</option>
                        <option value="Bajaj Pulsar 200">Bajaj Pulsar 200</option>
                        <option value="Yamaha FZ Verion 3.0">Yamaha FZ Verion 3.0</option>
                        <option value="Yamaha FZ Verion 4.0">Yamaha FZ Verion 4.0</option>
                        <option value="Jupitar">Jupitar</option>
                        <option value="Raider 125">Raider 125</option>
                        <option value="Honda Activa 6G">Honda Activa 6G</option>
                        <option value="Honda Dio">Honda Dio</option>
                        <option value="Honda City">Honda City</option>
                        <option value="Honda Amaze">Honda Amaze</option>
                        <option value="Tata Nexon">Tata Nexon</option>
                        <option value="Tata Punch">Tata Punch</option>
                        <option value="Maruti SWIFT">Maruti SWIFT</option>
                        <option value="Maruti Ertiga">Maruti Ertiga</option>
                        <option value="Hyundai i20">Hyundai i20</option>
                        <option value="Hyundai Verna">Hyundai Verna</option>
                            </select>
                            </div>
                            <br>
                                                   
            <div>
        <label>Tenure :</label>
       <select name="tenure">
        <option value=""></option>
        <option>1</option>
        </select>
            </div>
            <br>
                 <div>
        <label>Price :</label>
       <select name="price">
        <option value=""></option>
        <option>Rs.1500</option>
        <option>Rs.1700</option>
        <option>Rs.2000</option>
        <option>Rs.15000</option>
        <option>Rs.12000</option>
        <option>Rs.10000</option>
        <option>Rs.7000</option>
        </select>
            </div>
            <br>           
                                                  
    <button type="submit">Submit</button>
    </form>
   
   
 
   
</body>
</html>