import XCTest
@testable import iosApp
import shared

class iosAppTests: XCTestCase {

    override func setUp() {
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }

    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testExample() {
        let text = Greeting().greeting()
        XCTAssert(text.contains("iOS"), "Bad greeting")
//        XCTAssertEqual(text, "239", "Bad text")
        assert(text.isEqual("239"), "Bad text")

        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct results.
    }

    func testPerformanceExample() {
        // This is an example of a performance test case.
        self.measure {
            // Put the code you want to measure the time of here.
        }
    }

}
