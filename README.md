# Reminder System (Spring Boot)

ระบบช่วยจำ (Reminder) พัฒนาโดยใช้ Spring Boot รองรับ JWT Authentication พร้อมระบบเตือนอัตโนมัติแบบ Scheduled Task

## Features
- สมัครสมาชิก / ล็อกอิน (JWT Based)
- สร้าง, แก้ไข, ลบ และเรียกดู Reminder ส่วนตัว
- ตรวจสอบและแสดง Reminder ที่ครบกำหนดทุก 1 นาที

## วิธีใช้งาน

### 1. Build JAR
```bash
./mvnw clean package
```

### 2. Run with Docker
```bash
docker-compose up --build
```

### 3. API Endpoint
- POST `/api/auth/register`
- POST `/api/auth/login`
- GET `/api/reminders`
- POST `/api/reminders`
- PUT `/api/reminders/{id}`
- DELETE `/api/reminders/{id}`

ใช้ Authorization Header แบบ:
```
Authorization: Bearer <JWT>
```

## Technologies
- Java 17
- Spring Boot 3
- Spring Security + JWT
- Spring Scheduler
- MySQL (Docker Compose)

## หมายเหตุ
ระบบยังไม่รวมระบบส่งแจ้งเตือนจริง เช่น Email หรือ Line Notify (สามารถต่อยอดได้)

---

ติดต่อผู้พัฒนา: [your-email@example.com]
