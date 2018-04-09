import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import {Item} from './item';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class ItemService {

  private itemsUrl = 'http://localhost:8080/items';

  constructor(private httpClient: HttpClient) { }

  getItems(): Observable<Item []> {
  return this.httpClient.get<Item[]>(this.itemsUrl);
}
}
