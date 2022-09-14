#import "ac_ios_lib.h"

@implementation ac_ios_lib
- (NSString *)helloWithText:(NSString *)text {
    NSString * prefix = @"Hello";
    return [NSString stringWithFormat:@"%@, %@", prefix, text];
}
@end
