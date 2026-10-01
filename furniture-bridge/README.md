# Bridge Pattern - Furniture (Java)

Assignment #3, Software Design Patterns.

## Idea
Without Bridge, every combination of furniture type and material needs its own class
(WoodenChair, MetalChair, PlasticChair, WoodenTable, ...). With 3 types x 3 materials that is
9 classes, and every new material adds 3 more. With Bridge there are 3 + 3 = 6 classes,
and a new material adds only 1.

## Pattern roles
| Role | Class(es) |
| --- | --- |
| Abstraction | `Furniture` (abstract, holds `Material material`) |
| Refined Abstraction | `Chair`, `Table`, `Wardrobe` |
| Implementor | `Material` (interface) |
| Concrete Implementor | `WoodMaterial`, `MetalMaterial`, `PlasticMaterial` |
| Client | `Main` |

## Clean Code principles used
1. **Separation of abstraction-side and implementation-side responsibilities.**
   `Furniture` classes know *what* is built (parts, units, labour); `Material` classes know *how*
   the material is processed and how much it costs. They live in separate packages
   (`furniture.abstraction`, `furniture.implementor`).
2. **Meaningful names distinguishing roles.** `Furniture` / `Chair` are the abstraction side;
   `Material` / `WoodMaterial` are the implementor side. Methods like `shapePart`, `applyFinish`,
   `getCostPerUnit` say exactly what they do.
3. **Small, focused classes (Single Responsibility).** Every class has one reason to change and
   is under ~50 lines. `Chair` changes only if chairs change; `WoodMaterial` only if wood processing changes.
4. **No duplicated logic between Concrete Implementors, and no magic numbers.** Shared behaviour
   (price formula, parts) lives on the abstraction side; each implementor contains only its own
   material-specific text and cost, stored in named constants.
5. **Backward-compatible design (Open/Closed Principle).** Adding a new material (e.g. `GlassMaterial`)
   requires no change in `Furniture`, `Chair`, `Table`, `Wardrobe` or `Main`'s logic.
6. **Program to an interface and fail fast.** `Furniture` depends on the `Material` interface, never
   on a concrete class, and rejects `null` with `Objects.requireNonNull`. The client never sees
   implementor details.

## How to run
```
javac -d out $(find src -name "*.java")
java -cp out furniture.Main
```
