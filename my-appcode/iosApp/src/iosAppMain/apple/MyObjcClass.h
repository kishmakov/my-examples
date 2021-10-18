#import <Foundation/Foundation.h>


@interface MyObjcClass : NSObject
- (instancetype)initWithNumber:(int)number;
//- (MySwiftClass *)createSwiftClass:(int)year;

@property(strong, nonatomic) NSString *representation;
@end