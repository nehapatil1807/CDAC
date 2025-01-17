
# Difference Between DELETE, TRUNCATE, and DROP in SQL

| **Feature**       | **DELETE**                                | **TRUNCATE**                               | **DROP**                                |
|-------------------|-------------------------------------------|--------------------------------------------|-----------------------------------------|
| **Purpose**        | Removes specific rows                    | Removes all rows                           | Removes the entire table                |
| **Condition**      | Supports `WHERE` clause                  | Does not support `WHERE` clause            | Not applicable                          |
| **Logging**        | Logs individual row deletions            | Minimal logging (deallocation of pages)    | Logs removal of table metadata          |
| **Performance**    | Slower (row-by-row deletion)             | Faster (deallocates data pages)            | Fastest (removes entire table)          |
| **Structure**      | Retains table structure                  | Retains table structure                    | Deletes table structure                 |
| **Constraints**    | Enforces constraints (e.g., foreign keys)| Does not enforce constraints               | Drops all constraints with the table    |
| **Memory**         | Does not release memory                  | Releases allocated memory                  | Releases memory and table space         |
| **Rollback**       | Can be rolled back (transaction-safe)    | Cannot be rolled back in some databases    | Cannot be rolled back                   |
| **Usage**          | For selective deletion                   | For clearing all data quickly              | For permanently removing the table      |

> **Note:** The table provides a concise comparison of the three SQL commands (DELETE, TRUNCATE, and DROP) based on various key aspects. Make sure to use each command accordingly depending on your requirement.
