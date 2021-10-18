#import "MyObjcClass.h"
#import <iosApp-Swift.h>

@implementation MyObjcClass {

}
- (instancetype)init {
    self = [self initWithNumber:@0];
    return self;
}

- (instancetype)initWithNumber:(int)number {
    self = [super init];
    if (self) {
        MySwiftClass * od0 = [self createSwiftClass:number + 0];

        MySwiftClass * od1 = [self createSwiftClass:number + 1];
        MySwiftClass * od2 = [self createSwiftClass:number + 2];
        MySwiftClass * od3 = [self createSwiftClass:number + 3];
        MySwiftClass * od4 = [self createSwiftClass:number + 4];
        MySwiftClass * od5 = [self createSwiftClass:number + 5];
        MySwiftClass * od6 = [self createSwiftClass:number + 6];
        MySwiftClass * od7 = [self createSwiftClass:number + 7];
        MySwiftClass * od8 = [self createSwiftClass:number + 8];
        MySwiftClass * od9 = [self createSwiftClass:number + 9];

        MySwiftClass * od10 = [self createSwiftClass:number + 10];
        MySwiftClass * od11 = [self createSwiftClass:number + 11];
        MySwiftClass * od12 = [self createSwiftClass:number + 12];
        MySwiftClass * od13 = [self createSwiftClass:number + 13];
        MySwiftClass * od14 = [self createSwiftClass:number + 14];
        MySwiftClass * od15 = [self createSwiftClass:number + 15];
        MySwiftClass * od16 = [self createSwiftClass:number + 16];
        MySwiftClass * od17 = [self createSwiftClass:number + 17];
        MySwiftClass * od18 = [self createSwiftClass:number + 18];
        MySwiftClass * od19 = [self createSwiftClass:number + 19];

        _representation = [NSString stringWithFormat:@"-> %d",number];
    }
    return self;
}

- (MySwiftClass *)createSwiftClass:(int)year {
    MySwiftClass * result = [[MySwiftClass alloc] initWithYear:year];
    return result;
}

@end