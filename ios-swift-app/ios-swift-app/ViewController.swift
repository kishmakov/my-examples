//
//  ViewController.swift
//  ios-swift-app
//
//  Created by Kirill Shmakov on 19/10/2019.
//  Copyright © 2019 Kirill Shmakov. All rights reserved.
//
import UIKit

class ViewController: UIViewController {
    
    override func viewDidLoad() {        
//        let originalFrame = view.frame
//        
//        let xMargin: CGFloat = 20
//        let yMargin: CGFloat = 20
//
//        let mapHeight: CGFloat = 200
//        let mapWidth = originalFrame.size.width - 2 * xMargin
//
//        let mapRect = CGRect(x: xMargin, y: yMargin, width: mapWidth, height: mapHeight)
//        let map = MapView(frame: mapRect)
//        view.addSubview(map)
    }
    
    @IBAction func touchCard(_ sender: UIButton) {
        for view in self.view.subviews {
            view.setNeedsDisplay()
        }
        
        flipCard(withEmoji: "😡", on: sender)
    }
    
    func flipCard(withEmoji emoji: String, on button: UIButton) {
        button.setTitle(emoji, for: UIControl.State.normal)
        button.backgroundColor = #colorLiteral(red: 0.4666666687, green: 0.7647058964, blue: 0.2666666806, alpha: 1)
    }
}


