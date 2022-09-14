import SwiftUI

struct ContentView: View {
    var body: some View {
        let converter = ac_ios_lib()

        let pretext = "world!"
        let text = converter.hello(withText: pretext)
        Text(text!).padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
