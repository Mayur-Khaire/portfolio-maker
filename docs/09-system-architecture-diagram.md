# Portfolio Maker - System Architecture

```text
                    Internet
                        │
                        ▼
                  User Browser
                        │
                        ▼
          HTML • CSS • JavaScript UI
                        │
                 REST API (JSON)
                        │
                        ▼
              Spring Boot Application
                        │
          ┌─────────────┴─────────────┐
          │                           │
          ▼                           ▼
   Spring Data JPA              File Storage
          │                  (Images / Resume)
          │
          ▼
      MySQL Database

────────────────────────────────────────────

Deployment

                Browser
                    │
                    ▼
             Nginx Reverse Proxy
                    │
                    ▼
      Spring Boot Docker Container
                    │
                    ▼
        MySQL Docker Container
                    │
                    ▼
                 AWS EC2
```

## Components

### Frontend
- HTML
- CSS
- JavaScript

### Backend
- Spring Boot
- REST API
- Spring Data JPA

### Database
- MySQL

### DevOps
- Docker
- Docker Compose
- Nginx
- AWS EC2
