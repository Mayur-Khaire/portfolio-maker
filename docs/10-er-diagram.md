# Entity Relationship Diagram

```text

                    USER
────────────────────────────────
id (PK)
name
email
password
created_at
────────────────────────────────
            │
            │ 1
            │
            │
            ▼
        PORTFOLIO
────────────────────────────────
id (PK)
user_id (FK)
profession
tagline
about
phone
email
location
profile_image
resume
────────────────────────────────
      │
      ├──────────────┐
      │              │
      ▼              ▼
   PROJECT        EDUCATION

      │              │

      ▼              ▼

 EXPERIENCE      CERTIFICATION

      │

      ▼

   SKILL

      │

      ▼

 SOCIAL_LINK
```

## Relationships

User → One Portfolio

Portfolio → Many Skills

Portfolio → Many Projects

Portfolio → Many Education

Portfolio → Many Experience

Portfolio → Many Certifications

Portfolio → One Social Links
