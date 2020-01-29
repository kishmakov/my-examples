//
//  MapView.swift
//  ios-swift-app
//
//  Created by Kirill Shmakov on 28/10/2019.
//  Copyright © 2019 Kirill Shmakov. All rights reserved.
//

import Foundation
import UIKit
import SpriteKit
import map_library


class MapView: UIView {
    var x = CGFloat(0)
    var y = CGFloat(20)

    override init(frame: CGRect) {
        super.init(frame: frame)
        self.backgroundColor = #colorLiteral(red: 0.2196078449, green: 0.007843137719, blue: 0.8549019694, alpha: 1)
    }
     
    required init?(coder aDecoder: NSCoder) {
        super.init(coder: aDecoder)
    }
    
    private func redraw() {
        let path = UIBezierPath()
        path.move(to: CGPoint(x: x, y: y))
        path.addLine(to: CGPoint(x: x + 200, y: y))
        path.addLine(to: CGPoint(x: x, y: y + 100))
        path.close()
        
        let xx: Int32 = 10
        let yy: Int32 = 20
        let zz = ProviderKt.sum239(a: xx, b: yy)
        print("zz is \(zz)")
        
        path.lineWidth = 3.0
        UIColor.green.setStroke()
        UIColor.red.setFill()
        
        path.stroke()
        path.fill()
    }
    
    override func draw(_ rect: CGRect) {
        x += 20
        print("Redrawing map view")
        redraw()
    }
}
