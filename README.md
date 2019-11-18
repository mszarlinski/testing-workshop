# Testing Workshop
### Content
0. Unit testing 101
    - given/when/then
    - one assertion per test
    - only relevant things in given
    - testing time
    - test objects builders
    - fluent assertions
1. Unit testing larger components (modules)
    - overmocking
    - ports & adapters for better testability
    - avoid domain objects, use DTO to hide implementation
2. Integration testing instead of mocks
    - testing controllers
3. Testing asynchronous code
    - awaitility
4. Testing integration with another service
    - WireMock
    - testing Kafka consumer

### Domain
Development process
- task management system (Jira)
- Pull request, code review
- CI, building packages
- Deployment

1. Jira
Task
    Author
    Assignee
    Status (Todo, In progress, In review, In test, Done, Rejected)

2. Stash
Repository
    Commits
    Branch
    Pull Request (issues In progress -> In review)
    Merge
Artifactory
    
3. Bamboo
Package
    
4. Deployments
Deployment (issues In test -> Done)