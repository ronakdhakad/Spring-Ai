## Day 1 - Spring AI Chat API

Today I built my first Spring AI REST API using Spring Boot.

### What I implemented:
- Created `ChatController`
- Injected `ChatClient` using `ChatClient.Builder`
- Added `GET /chat` endpoint
- Accepted user query using `@RequestParam`
- Sent prompt to AI model
- Returned generated response using `ResponseEntity`

### API Example:
`/chat?q=What is Java?`

### Key Learning:
- How to integrate Spring AI in Spring Boot
- How `ChatClient` works
- Prompt → AI Response flow
- Building simple AI-powered REST APIs
