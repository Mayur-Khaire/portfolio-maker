# System Architecture

                Browser

                   │

                   ▼

        HTML CSS JavaScript

                   │

              REST API

                   │

                   ▼

             Spring Boot

                   │

           Spring Data JPA

                   │

                   ▼

                MySQL

---------------------------------------

Deployment

Browser

↓

Nginx

↓

Spring Boot Container

↓

MySQL Container

↓

Docker Compose

↓

AWS EC2