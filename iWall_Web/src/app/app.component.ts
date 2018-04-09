import { Component, OnInit } from '@angular/core';

import { Item } from './item';
// import { Items } from './mock-items';
import {ItemService} from './item.service';
import {Observable} from 'rxjs/Observable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'iWall_Web';
  // items = Items;

    items: Item[];

    constructor(private itemService: ItemService) {
    }

    ngOnInit() {
      this.getItems();
    }

    getItems(): void {
      this.itemService.getItems().subscribe(items => this.items = items);
    }
}
