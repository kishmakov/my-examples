#import "MyNumber.h"


@implementation MyNumber {

}
- (instancetype)init {
    self = [self initWithNumber:@0];
    return self;
}

- (instancetype)initWithNumber:(int)number {
    self = [super init];
    if (self) {
        _representation = [NSString stringWithFormat:@"%d",number];
    }
    return self;
}

@end