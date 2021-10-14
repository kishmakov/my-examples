//
// Created by Kirill Shmakov on 14.10.2021.
//

#import <Foundation/Foundation.h>


@interface MyNumber : NSObject
- (instancetype)initWithNumber:(int)number;

@property(strong, nonatomic) NSString *representation;
@end