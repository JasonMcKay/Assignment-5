# Vehicle Manufacturer Domail Model

Introduction

This domain model is a representation of a vehicle manufacturer, that manufacturers
cars and bikes. Each vehicle can be manufactured with a different engine type as well
as a different door type. This domain model assignment makes use of the following
software design patterns: factory method, singleton pattern, builder pattern and also 
a chain of responsibility.

#Class Diagram of the Domain Model

![alt tag](https://raw.githubusercontent.com/JasonMcKay/Assignment-5/master/model.png)

#Description of Domain Model

As mentioned above this model represents a vehicle manufacturer, where bikes and 
cars can be manufactured with different engines and doors.
The Manufacturer is a singleton which gets created, it can create either a bike or a car. 
The CarVehicleBuilder and BikeVehicleBuilder are cleints of the builder pattern whereby 
they will get a vehicle instance from the VehicleDirector which would be of 
type vehicle. A vehicle is in need of an engine and doors. 
Firstly the vehicle would reguest an instance of an engine whilst specifying the type of 
engine needed. The EngineType is the interface for the factory method, where different
engines can be created and used in a vehicle.
Secondly a vehicle needs doors which is handled by the use of a chain of responsibility,
where a string request is sent and hendled by DoorHandler to find and utilize the correct
type of doors.
The engine and doors are then set to the vehicle, while the engine can later be modified.