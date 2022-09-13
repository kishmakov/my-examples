#include <stdlib.h>

#include "math.h"

int64_t normL1(int64_t x, int64_t y) {
    int64_t absx = llabs(x);
    int64_t absy = llabs(y);
    return absx + absy;
}
