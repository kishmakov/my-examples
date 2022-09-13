//
//  xc_appApp.swift
//  xc-app
//
//  Created by Kirill Shmakov on 13.09.2022.
//

import SwiftUI

@main
struct xc_appApp: App {
    let persistenceController = PersistenceController.shared

    var body: some Scene {
        WindowGroup {
            ContentView()
                .environment(\.managedObjectContext, persistenceController.container.viewContext)
        }
    }
}
