# Database Design

## Tables

### User

- id
- full_name
- email
- password
- created_at

--------------------------------

### Portfolio

- id
- user_id
- profession
- tagline
- about
- phone
- email
- location
- resume
- profile_image

--------------------------------

### Skill

- id
- portfolio_id
- skill_name

--------------------------------

### Education

- id
- portfolio_id
- degree
- institute
- university
- start_year
- end_year
- cgpa

--------------------------------

### Experience

- id
- portfolio_id
- company
- designation
- description
- start_date
- end_date

--------------------------------

### Project

- id
- portfolio_id
- title
- description
- github
- live_demo
- image

--------------------------------

### Certification

- id
- portfolio_id
- certificate_name
- issuer
- issue_date
- credential_url

--------------------------------

### SocialLink

- id
- portfolio_id
- github
- linkedin
- twitter
- instagram
- website

--------------------------------

Relationship

User

│

└── Portfolio

      ├── Skills

      ├── Education

      ├── Experience

      ├── Projects

      ├── Certifications

      └── Social Links