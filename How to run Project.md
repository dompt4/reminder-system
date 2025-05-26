ขั้นตอนสั่งใช้งานโปรเจกต์ใน IntelliJ IDEA
1. เปิดโปรเจกต์ใน IntelliJ IDEA
เปิด IntelliJ IDEA

เลือก Open หรือ Open Existing Project

เลือกโฟลเดอร์โปรเจกต์ (โฟลเดอร์ที่มีไฟล์ pom.xml)

รอ IntelliJ โหลดและ Index โค้ดพร้อมดาวน์โหลด dependencies

2. ตั้งค่า JDK
ไปที่ File > Project Structure > Project

ตั้งค่า Project SDK เป็น Java 17 (ถ้ายังไม่มีให้เพิ่ม JDK 17 จากที่ติดตั้งไว้ในเครื่อง)

ตั้งค่า Project language level เป็น 17 (หรือ Default)

3. ตรวจสอบ Dependencies
IntelliJ จะดาวน์โหลด dependencies จาก pom.xml อัตโนมัติ (ถ้ามีปัญหากดขวาที่ pom.xml แล้วเลือก Maven > Reimport)

ตรวจสอบในแท็บ Maven ที่อยู่ทางขวาเพื่อดูสถานะ

4. ตั้งค่าไฟล์ application.properties หรือ application.yml
ตรวจสอบไฟล์ config อยู่ใน src/main/resources

กำหนดค่า database connection ให้ตรงกับ MySQL ที่ใช้งาน เช่น

properties
คัดลอก
แก้ไข
spring.datasource.url=jdbc:mysql://localhost:3306/reminder_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
ถ้าใช้ Docker Compose ให้ใช้ค่า environment ตามนั้น

5. Build โปรเจกต์
กด Build > Build Project (หรือ Ctrl+F9)

รอจนไม่มี error

6. Run Spring Boot Application
เปิดไฟล์ ReminderSystemApplication.java

คลิกขวาที่ class แล้วเลือก Run 'ReminderSystemApplication.main()'

รอระบบเริ่มทำงาน (จะเห็น log ใน Run console)

7. ทดสอบ API
เปิดเบราว์เซอร์หรือ Postman

เรียก API เช่น

POST http://localhost:8080/api/auth/register (สมัครสมาชิก)

POST http://localhost:8080/api/auth/login (ล็อกอิน)

ใช้ JWT token ใน Authorization Header เพื่อเรียก API Reminder ต่าง ๆ

8. (ถ้าต้องการ) สร้างไฟล์ JAR สำหรับ Deploy
รันคำสั่งใน Terminal (ภายใน IntelliJ หรือภายนอก)

bash
คัดลอก
แก้ไข
./mvnw clean package
ไฟล์จะถูกสร้างใน target/reminder-system-0.0.1-SNAPSHOT.jar
