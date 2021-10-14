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

        let mn = MyNumber(number: 12)
        print(mn!.representation!)

        var threeDoubles = Array(repeating: 0.0, count: 3)

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