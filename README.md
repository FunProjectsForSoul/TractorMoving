Moving the tractor
=============================

[![CheckStyle](https://github.com/Bangerok/TractorMoving/actions/workflows/check-style.yml/badge.svg)](https://github.com/Bangerok/TractorMoving/actions/workflows/check-style.yml)
[![Sonar](https://github.com/Bangerok/TractorMoving/actions/workflows/sonar.yml/badge.svg)](https://github.com/Bangerok/TractorMoving/actions/workflows/sonar.yml)
[![Build](https://github.com/Bangerok/TractorMoving/actions/workflows/build.yml/badge.svg)](https://github.com/Bangerok/TractorMoving/actions/workflows/build.yml)

### Description
___

There is a square field of **n × n** cells. In the center of this field there is a square mountain of **m × m** cells, 
and in the lower left corner there is a square tractor of **k × k** cells, which can move along the field.

### Conditions
___

1. Sizes: fields — n, mountains — m and tractor — k, are entered from the keyboard.
2. The tractor moves an arbitrary number of cells up, down, left or right.
   _If it is not possible to move the tractor (for example, if the path abuts against a hill), then leave the tractor 
   in place. The field is considered to be closed in a ring, that is, when the tractor leaves the left border of the 
   field, it appears on the right, and so on._
3. Display the current coordinates of the lower left corner of the tractor.