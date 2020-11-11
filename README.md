## Election Settings
[ElectionSettings.kt](domian/src/main/kotlin/com/seanshubin/condorcet/specification/domian/ElectionSettings.kt)

## Scripts
- provision
    - sets up any missing infrastructure
    - does nothing if all infrastructure is already in place
    - database would be set up here
- deploy (stop provision deploy start)
    - pushes code
    - does not touch database
- backup
    - backs up database
- restore
    - restores database
- start
    - launches all processes
- stop
    - halts all processes
    - does nothing if not running
- teardown (stop teardown)
    - removes non-data infrastructure
    - leaves database alone
- purge (backup stop teardown purge)
    - removes database
    - does not touch backups
