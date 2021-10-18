import SwiftUI
import shared

enum MyError: Error {
    case runtimeError(String)
}

func checkN(n: Int) throws -> Bool {
    if (n > 10) {
        throw MyError.runtimeError("n is greet")
    }

    return n % 2 == 0
}

func greet() -> String {
    return Greeting().greeting()
}

class ObjectWithDescription: CustomStringConvertible {
    var /*offset:field*/field = "fieldValue"

    var description: String {
        return "foo"
    }
}

class ObjectWithDebugDescription: CustomDebugStringConvertible {
    var /*offset:field*/field = "fieldValue"


    public var debugDescription: String {
        return "foo"
    }
}


class Postfix {
    let ITERATIONS = 10
    var N = 0

    func message() -> String {

        for i in 0...ITERATIONS {
            for j in 0...ITERATIONS {
                for k in 0...ITERATIONS {
                    cleanUp()
                    N = i + j + k + 1
                }
            }
        }

        let d0 = MySwiftClass(year:2020)
        let d1 = MySwiftClass(year:2021)
        let d2 = MySwiftClass(year:2022)
        let d3 = MySwiftClass(year:2023)
        let d4 = MySwiftClass(year:2024)
        let d5 = MySwiftClass(year:2025)
        let d6 = MySwiftClass(year:2026)
        let d7 = MySwiftClass(year:2027)
        let d8 = MySwiftClass(year:2028)
        let d9 = MySwiftClass(year:2029)

        let d10 = MySwiftClass(year:2020)
        let d11 = MySwiftClass(year:2021)
        let d12 = MySwiftClass(year:2022)
        let d13 = MySwiftClass(year:2023)
        let d14 = MySwiftClass(year:2024)
        let d15 = MySwiftClass(year:2025)
        let d16 = MySwiftClass(year:2026)
        let d17 = MySwiftClass(year:2027)
        let d18 = MySwiftClass(year:2028)
        let d19 = MySwiftClass(year:2029)

        var od = ObjectWithDescription()
        var odd = ObjectWithDebugDescription()

        var threeDoubles = Array(repeating: 0.0, count: 3)

        let mn = MyObjcClass(number: 2000)
        print(mn?.representation)

        do {
            try checkN(n: N)
        } catch MyError.runtimeError(let errorMessage) {
            return "Swift error: \(errorMessage)"
        } catch {
            return "Unhandled exception"
        }

        return "\(N)"
    }

    func cleanUp() {
        if (N > 0) { N = 0 }
    }
}

struct ContentView: View {

    var body: some View {
        let postfix = Postfix()
        let postfixMessage: String? = postfix.message()

        Text(greet() + " <-> " + postfixMessage.unsafelyUnwrapped)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}