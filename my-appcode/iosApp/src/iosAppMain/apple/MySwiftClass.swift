import Foundation
import UIKit

@objc class MySwiftClass: NSObject {
    @objc public override init() {
        var dateComponents = DateComponents()

        dateComponents.year = 2000
        dateComponents.month = 7
        dateComponents.day = 11
        dateComponents.timeZone = TimeZone(abbreviation: "UTC")
        dateComponents.hour = 8
        dateComponents.minute = 34

        let calendar = Calendar(identifier: .gregorian)

        date = calendar.date(from: dateComponents)!
    }

    @objc public init(year: Int) {
        var dateComponents = DateComponents()

        dateComponents.year = year
        dateComponents.month = 7
        dateComponents.day = 11
        dateComponents.timeZone = TimeZone(abbreviation: "UTC")
        dateComponents.hour = 8
        dateComponents.minute = 34

        let calendar = Calendar(identifier: .gregorian)

        date = calendar.date(from: dateComponents)!
    }

    @objc public var date: Date

    override var description: String {
        "foo"
    }

    override var debugDescription: String {
        "bar"
    }
}