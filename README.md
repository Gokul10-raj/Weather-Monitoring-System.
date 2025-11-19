# Weather-Monitoring-System.
Java-based Weather Monitoring System using OOP, Threads, GUI, File I/O, and Serialization.
Weather Monitoring System (Java – OOP + GUI + Threads + Serialization)

A real-time weather tracking application built using Java (NetBeans).
The system simulates temperature & humidity readings using OOP principles and displays them via a modern Swing-based GUI.

📘 Project Overview

This Weather Monitoring System is a Java desktop application that demonstrates complete OOP implementation with:

Real-time sensor simulation

Multithreading

GUI screens using Swing

Custom exception handling

Collections for log storage

File I/O (text export)

Serialization (save & load logs)

It is fully offline and ideal for academic demonstrations of OOPS concepts.

🚀 Key Features
🔹 OOP-Based Sensor System

Sensor (abstract class)

TemperatureSensor & HumiditySensor (inheritance)

Monitorable (interface)

InvalidReadingException (custom exception)

🔹 Real-Time Monitoring

Background thread (LiveMonitor) updates readings every 2 seconds.

🔹 Interactive GUI (Swing)

Main Page – start monitoring, view logs, open live dashboard

Live Dashboard – auto-updating temperature & humidity

Log Viewer – scrollable logs + save/clear/load options

🔹 Data Storage

Logs stored in ArrayList<String>

Save logs as .txt

Serialize logs to .ser

Load previously saved logs
