import SwiftUI
import xc_ios_framework

struct ContentView: View {
    var body: some View {
        VStack {
            let x: Int64 = 10
            let y: Int64 = 12
            let l1 = normL1(x, y)
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundColor(.accentColor)
            Text("l1(\(x), \(y)) = \(l1)" )
        }
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
